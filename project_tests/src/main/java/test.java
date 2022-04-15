import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class test {
    public static void main(String[] args) {
        // TODO(developer): Uncomment these lines.
// import com.google.cloud.translate.*;
 Translate translate = TranslateOptions.getDefaultInstance().getService();

        Translation translation = translate.translate("¡Hola Mundo!");
        System.out.printf("Translated Text:\n\t%s\n", translation.getTranslatedText());
    }
}
