package server;

/**
 * Created by xiaoming on 14/01/16.
 */
public interface ServerInterface {
    void startServer();
    void handleClientRequest();
    char getRequestCharacter();
    void parseCharacterToKeypress(char arg);
}
