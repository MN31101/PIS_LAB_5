# Cash Register API

## Опис

Цей проєкт реалізує REST API для обліку готівки у касі підприємства. Система дозволяє:

- Реєструвати прибуткові та видаткові касові ордери.
- Вести облік касових операцій за рахунками.
- Визначати поточне сальдо каси.
- Отримувати сальдо через зовнішній запит (наприклад, із корпоративного чату).
- Показувати персональну інформацію студента за логіном у Moodle.

## Сценарій використання API

### 1. Оприбуткування готівки

**POST** `/cash/order`

```json
{
  "type": "INCOME",
  "amount": 5000.0,
  "account": "33",
  "comment": "Надходження з банку"
}
```
### 2. Видаток готівки

**POST** `/cash/order`

```json
{
  "type": "EXPENSE",
  "amount": 1200.0,
  "account": "36",
  "comment": "Видано підзвітнику"
}
```
### 3. Отримання сальдо каси

**GET** `/cash/balance`

```json
{
  "balance": 3800.0,
  "currency": "UAH"
}
```
### 4. Отримання інформації студента

**GET** `get-info/is-34fiot-23-170`

```json
{
  "login": "is-34fiot-23-170",
  "name": "Педько Микита",
  "course": "2 курс",
  "group": "ІС-34"
}
```
## Як запустити

### 1. Склонуйте проєкт:
```bash
git clone https://github.com/your-username/cash-register-api.git
cd cash-register-api
```
### 2. Запуск:
```bash
./gradlew bootRun
```
### API доступне за адресою: http://localhost:8080

## Технології

- Java 17+ 
- Spring Boot (Gradle, Groovy DSL)
- REST API 
- JSON (Jackson)


