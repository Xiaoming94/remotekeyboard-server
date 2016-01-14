%%%-------------------------------------------------------------------
%%% @author xiaoming
%%% @copyright (C) 2016, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 14. Jan 2016 15:57
%%%-------------------------------------------------------------------
-module(server).
-author("xiaoming").

%% API
-export([start_server/1,receive_request/1]).

start_server(ServerName) ->
  register(list_to_atom(ServerName),spawn(fun()->start_server_process(self())end)),
  receive
    {client_connected,ClientName} -> ClientName
  end.

start_server_process(From) ->
  receive
    {request_connection,ClientPid,ClientName} ->
      ClientPid ! {ok,connected},
      From ! {client_connected,ClientName}
  end.

receive_request(ServerName) ->
  register(list_to_atom(ServerName),spawn(fun()->receive_request_process(self())end)),
  receive
    {request_received,Key} -> Key
  end.

receive_request_process(From) ->
  receive
    {request,ClientPid,Key} ->
      ClientPid ! {ok,request_received},
      From ! {request_received,Key}
  end.
