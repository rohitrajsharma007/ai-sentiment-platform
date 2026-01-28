from sklearn.feature_extraction.text import CountVectorizer
from sklearn.linear_model import LogisticRegression
import pickle

texts = [
    "I love this",
    "bad product",
    "awesome experience",
    "worst ever",
    "very good",
    "not happy"
]

labels = [
    "positive",
    "negative",
    "positive",
    "negative",
    "positive",
    "negative"
]

vectorizer = CountVectorizer()
X = vectorizer.fit_transform(texts)

model = LogisticRegression()
model.fit(X, labels)

pickle.dump(model, open("model.pkl", "wb"))
pickle.dump(vectorizer, open("vector.pkl", "wb"))

print("Model trained")
