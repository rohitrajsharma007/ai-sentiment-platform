FROM python:3.10

WORKDIR /app

COPY . .

RUN pip install flask scikit-learn

EXPOSE 5000

CMD ["python","app.py"]
