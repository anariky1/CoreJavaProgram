package howStaticInitializerBlockWorks;

import java.io.IOException;
import java.util.HashMap;

public class RealTimeusage {

static final HashMap<String,String> hmap= new HashMap<>();

static{
try{
Class.forName("com.example.jdbc.driver");

}catch(ClassNotFoundException e){
e.printStackTrace();
}

try{
config.load(Thread.currentThread().getContextClassLoader().getSystemResourceAsStream("config.properties"));
}catch(IOException e){
e.printStackTrace();
}

hmap.put("A", "B");

}

public static void main(String[] args) {



}

}


