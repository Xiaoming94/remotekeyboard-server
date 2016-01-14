package server;

/**
 * Created by xiaoming on 14/01/16.
 */
public interface ServerInterface {
    void startServer();
    char handleClientRequest();
    void parseCharacterToKeypress(char key);
}
