import com.blade.Blade;

public class Application {
    public static void main(String[] args) {
        Blade.me().get("/",(request, response) -> response.text("Hello World!")).showFileList(true).start(Application.class,args);
    }


}
