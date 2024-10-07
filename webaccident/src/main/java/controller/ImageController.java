import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ImageController {

    @PostMapping("/classify")
    public ResponseEntity<Map<String, String>> classifyImage(@RequestParam("file") MultipartFile file) {
        // هنا سيتم تصنيف الصورة باستخدام النموذج الخاص بك
        // في الوقت الحالي سأقوم بإرجاع نتيجة اختبارية
        
        // من المفترض هنا تحميل النموذج وتشغيله على الصورة
        
        String result = "Accident Detected"; // أو استبدلها بنتيجة التصنيف من النموذج
        Map<String, String> response = new HashMap<>();
        response.put("result", result);

        return ResponseEntity.ok(response);
    }
}
