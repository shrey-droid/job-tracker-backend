# 📂 Job Tracker Backend API

A full-featured backend REST API to manage job applications. Built with **Java**, **Spring Boot**, and **MySQL**.

## 🚀 Features

- CRUD APIs for job applications
- Role-based structure (admin/user-ready)
- Input validation & global exception handling
- MySQL DB integration (or switch to H2 easily)
- Pagination & search ready
- RESTful endpoints with clean architecture
- Easily deployable on Render or Heroku

## 📦 Tech Stack

- Java 17
- Spring Boot 3.x
- MySQL (or H2)
- Spring Data JPA
- Spring Validation
- Lombok
- Postman tested
- Render (for deployment)

## 📁 Project Structure

src/
└── main/
├── java/
│ └── com.shrey.jobtracker
│ ├── controller
│ ├── entity
│ ├── repository
│ └── service
└── resources/
├── application.properties
└── static / templates

bash
Copy
Edit

## 🔧 How to Run

```bash
# Clone repo
git clone https://github.com/shrey-droid/job-tracker-backend.git
cd job-tracker-backend

# Build & run
./gradlew build
java -jar build/libs/job-tracker-backend-0.0.1-SNAPSHOT.jar
🌐 API Endpoints
Method	Endpoint	Description
GET	/api/jobs	Get all job apps
POST	/api/jobs	Add a new job app
GET	/api/jobs/{id}	Get job by ID
PUT	/api/jobs/{id}	Update job by ID
DELETE	/api/jobs/{id}	Delete job by ID

🔐 Validation Example (POST)
json
Copy
Edit
{
  "position": "Java Developer",
  "company": "Amazon",
  "status": "Applied",
  "appliedDate": "2024-07-01",
  "notes": "Waiting for response"
}
💻 Author
Made with ❤️ by Shrey Patel

bash
Copy
Edit

### ✅ Add this to your project:

```bash
echo "[paste-above-README-here]" > README.md
git add README.md
git commit -m "📝 Add project README"
git push