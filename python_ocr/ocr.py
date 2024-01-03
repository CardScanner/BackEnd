import PIL.Image
from flask import Flask, request, jsonify
import pytesseract
from PIL import Image
import werkzeug
import io

app = Flask(__name__)

@app.route('/process-image', methods=['POST'])
def process_image():
    if(request.method == "POST"):
     image_file = request.files['image']
     filename = werkzeug.utils.secure_filename(image_file.filename)
     image_file.save("./uploadedimages/" + filename)
     myconfig = r"--psm 11 --oem 3"
     text = pytesseract.image_to_string(PIL.Image.open(image_file),config=myconfig)
     print(text)
    return jsonify({
       "message": "Image Uploaded Successfully"
    })

if __name__ == '__main__':
    app.run(debug=True , port=4000)