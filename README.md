# 📡 Broadcast Server (Spring Boot WebSocket)

A simple real-time **broadcast chat server** built using **Spring Boot WebSockets (STOMP)**.
This application allows multiple clients to connect and exchange messages instantly.

---

## 🚀 Features

* 🔗 Real-time communication using WebSockets
* 📢 Broadcast messages to all connected clients
* 👥 Multiple clients support
* 💾 In-memory message storage (ChatService)
* 🌐 Browser-based client (HTML + JavaScript)
* ⚡ Lightweight and easy to run

---

## 🧠 How It Works

1. Client connects to WebSocket endpoint `/ws`
2. Client sends message to `/app/sendMessage`
3. Server processes message via `ChatService`
4. Message is broadcast to `/topic/messages`
5. All subscribed clients receive the message

---

## 🏗️ Project Structure

```
broadcast-server/
│
├── pom.xml
├── README.md
│
└── src/main/
    ├── java/com/example/broadcast/
    │   ├── BroadcastApplication.java
    │   ├── config/
    │   │   └── WebSocketConfig.java
    │   ├── controller/
    │   │   └── ChatController.java
    │   ├── service/
    │   │   └── ChatService.java
    │   ├── model/
    │   │   └── ChatMessage.java
    │
    └── resources/
        ├── application.properties
        └── static/
            └── index.html
```

---

## ⚙️ Technologies Used

* Java 17+
* Spring Boot
* Spring WebSocket
* STOMP Protocol
* SockJS
* JavaScript (Frontend)

---

## 📦 Prerequisites

Make sure you have installed:

* Java (JDK 17 or higher)
* Maven
* Web Browser (Chrome/Edge/Firefox)

---

## ▶️ How to Run

### 1. Clone the repository

```
git clone <your-repo-url>
cd broadcast-server
```

### 2. Run the application

```
mvn spring-boot:run
```

### 3. Open in browser

```
http://localhost:8080
```

---

## 🧪 How to Test

1. Open the app in **multiple browser tabs**
2. Enter different usernames (e.g., Alice, Bob)
3. Send messages from one tab
4. Verify messages appear in all tabs

✅ If messages are visible everywhere → Broadcast is working

---

## 🌐 Access from Other Systems

1. Find your system IP:

   ```
   ipconfig   (Windows)
   ifconfig   (Linux/Mac)
   ```

2. Access from another device:

   ```
   http://<your-ip>:8080
   ```

3. Update WebSocket URL in frontend if needed:

   ```javascript
   new SockJS('http://<your-ip>:8080/ws');
   ```

---

## ⚠️ Common Issues

| Issue                           | Solution                                |
| ------------------------------- | --------------------------------------- |
| Port already in use             | Change port in `application.properties` |
| WebSocket not connecting        | Check `/ws` endpoint                    |
| Messages not broadcasting       | Verify `/topic/messages` subscription   |
| Cannot access from other device | Check firewall / same network           |

---

## 💡 Future Enhancements

* 👤 User authentication (JWT)
* 💬 Chat rooms (multiple topics)
* 🗄️ Database integration (MySQL/PostgreSQL)
* 📱 Mobile client support
* 🧾 Chat history persistence
* 🔔 Notifications (join/leave)

---

## 📸 Demo Flow

```
Alice → Hello → Server → Broadcast → Bob, Charlie receive
```

---

## 🤝 Contribution

Feel free to fork this project and improve it with new features!

---

## 📄 License

This project is open-source.

---
