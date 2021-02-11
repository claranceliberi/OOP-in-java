package Network;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

        public static void main(String[] args) throws Exception{
            URL url = new URL("https://nuxtjs.org/docs/2.x/get-started/installation");

//
//            System.out.println("host: " + url.getHost() + "" +
//                    "port: " + url.getPort() + "" +
//                    "queryString: "+ url.getQuery());


            URLConnection urlc = url.openConnection();
            InputStream input = urlc.getInputStream();

            int c;
            while( (c = input.read() ) != -1 ){
                System.out.print((char)c);
            }

        }
}
