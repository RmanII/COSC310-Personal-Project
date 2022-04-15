import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.json.gson.GsonFactory;
//import com.google.api.services.translate.Translate;
//import com.google.api.services.translate.model.TranslationsListResponse;
//import com.google.api.services.translate.model.TranslationsResource;

//import com.google.cloud.translate.Detection;
//import com.google.cloud.translate.Translate;
//import com.google.cloud.translate.Translate.TranslateOption;
//import com.google.cloud.translate.TranslateOptions;
//import com.google.cloud.translate.Translation;
 import com.google.cloud.translate.*;

public class TranslatorAPI {



    public static void main(String[] args) {

        System.setProperty("GOOGLE_API_KEY","AIzaSyBTntju-sScu_1Gub7mixlj6Z0k0K7LBjA");

        Translate translate = TranslateOptions.getDefaultInstance().getService();

        Translation translation = translate.translate("¡Hola Mundo!");
        System.out.printf("Translated Text:\n\t%s\n", translation.getTranslatedText());
//
//        Translate translate = TranslateOptions.getDefaultInstance().getService();
//
//        final String Text = "Hola Mundo";
//
//        // detect language
//        Detection detection = translate.detect(Text);
//        String detectedLanguage = detection.getLanguage();
//
//        // Translate the text to English
//        Translation translation = translate.translate(Text, TranslateOption.sourceLanguage(detectedLanguage), TranslateOption.targetLanguage("en"));
//
//        System.out.println(translation.getTranslatedText());
    }
}
