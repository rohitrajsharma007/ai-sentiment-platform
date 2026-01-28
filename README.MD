# 🚀 AI Sentiment Analysis Platform (Full-Stack)

A full-stack AI Sentiment Analysis application built with:

- ⚛️ React (Frontend)
- ☕ Spring Boot (Backend API)
- 🧠 Python + scikit-learn (Machine Learning)
- 🌐 Flask (ML Microservice)
- 🗄️ H2 / PostgreSQL (Database)
- 📘 Swagger OpenAPI
- 🐳 Docker + Docker Compose

The system analyzes user text and predicts sentiment (Positive / Negative), while storing prediction history.

---

## 🧱 Architecture

React UI → Spring Boot API → Flask ML Service → scikit-learn Model
|
v
Database


---

## ✨ Features

- Real-time sentiment prediction
- React frontend with history view
- Spring Boot REST APIs
- Python ML microservice (Logistic Regression)
- Prediction history stored in database
- Swagger UI for API testing
- Dockerized services (Spring + ML)
- Microservice communication via REST

---

## 📁 Project Structure

ai-sentiment-project/
│
├── frontend/ # React UI
│
├── ml-service/ # Python ML + Flask
│ ├── model.py
│ ├── app.py
│ └── Dockerfile
│
├── springboot-api/ # Spring Boot backend
│ ├── src/main/java/...
│ ├── pom.xml
│ └── Dockerfile
│
├── docker-compose.yml
└── README.md


---

## 🛠 Tech Stack

### Frontend
- React
- Fetch API

### Backend
- Java 17
- Spring Boot 3
- Spring Data JPA
- Swagger (springdoc-openapi)

### Machine Learning
- Python 3
- scikit-learn
- Flask
- Logistic Regression
- CountVectorizer

### DevOps
- Docker
- Docker Compose

---

## ▶️ Run Locally (Without Docker)

### 1️⃣ Start ML Service

```bash
cd ml-service
pip install flask scikit-learn
python model.py
python app.py
Runs on:

http://localhost:5000
2️⃣ Start Spring Boot
cd springboot-api
mvn spring-boot:run
Runs on:

http://localhost:8080
Swagger:

http://localhost:8080/swagger-ui/index.html
3️⃣ Start React UI
cd frontend
npm install
npm start
Open:

http://localhost:3000
🐳 Run With Docker
Build Spring Boot first:

cd springboot-api
mvn clean package
From project root:

docker-compose up --build
📘 API Example
Predict Sentiment
POST /sentiment
Request:

{
  "text": "I love Spring Boot and AI"
}
Response:

{
  "sentiment": "positive"
}
View History
GET /sentiment/history
🧠 ML Details
Algorithm: Logistic Regression

Text Vectorization: CountVectorizer

Output: positive / negative

🚀 Future Enhancements
PostgreSQL (replace H2)

JWT Authentication

AWS EC2 Deployment

CI/CD with GitHub Actions

Improved ML model (TF-IDF + confidence score)

🏆 Resume Description
Built full-stack AI Sentiment Analysis platform using React, Spring Boot, Python ML, Docker, and database persistence.
Implemented microservice architecture with Flask ML service.
Added Swagger OpenAPI, prediction history, and Docker Compose.
Developed React UI for real-time sentiment prediction.
👨‍💻 Author
Rohit Sharma
