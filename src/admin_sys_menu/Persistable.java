package admin_sys_menu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface Persistable {

    void writeIn(Object x) throws IOException, ClassNotFoundException;
    ArrayList<Object> readFrom() throws IOException, ClassNotFoundException;
    void writeHeader() throws IOException;
}
