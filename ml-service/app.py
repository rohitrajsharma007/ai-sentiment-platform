from flask import Flask, request, jsonify
import pickle

app = Flask(__name__)

model = pickle.load(open("model.pkl", "rb"))
vector = pickle.load(open("vector.pkl", "rb"))

@app.route("/predict", methods=["POST"])
def predict():
    data = request.get_json()
    text = data["text"]

    X = vector.transform([text])
    result = model.predict(X)[0]

    return jsonify({"sentiment": result})

app.run(port=5000)
