document.getElementById('uploadForm').addEventListener('submit', function(event) {
    event.preventDefault(); // منع الإرسال الافتراضي للنموذج

    const formData = new FormData();
    const fileInput = document.getElementById('file');
    formData.append('file', fileInput.files[0]);

    fetch('http://localhost:8080/api/images/upload', {
        method: 'POST',
        body: formData
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('خطأ في الاتصال بالخادم');
        }
        return response.text();
    })
    .then(result => {
        document.getElementById('result').innerText = result; // عرض النتيجة
    })
    .catch(error => {
        document.getElementById('result').innerText = error.message;
    });
});
