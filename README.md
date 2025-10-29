# Portfolio - Full Stack Application for Portfolio
---
### 🧱 **Week 1 – Foundation & Portfolio API**

| Day       | Focus Area                       | Detailed Tasks                                                                                     | Outcome                                        |
|-----------|----------------------------------|----------------------------------------------------------------------------------------------------|------------------------------------------------|
| **Day 1** | Project Setup                    | Create `portfolio-api` and `metrics-api` Spring Boot apps. Add Dockerfile, `.env`, MongoDB config. | Two running apps locally with `/ping` working. |
| **Day 2** | Common Setup                     | Add Docker Compose for both apps + MongoDB. Prepare base project structure.                        | Full local environment runs with one command.  |
| **Day 3** | Portfolio Models                 | Create models: `PersonalInfo`, `Skill`, `Experience`, `Certification`, `Account`.                  | All entities mapped with Mongo and tested.     |
| **Day 4** | Portfolio Services & Controllers | Implement service + REST endpoints `/api/skills`, `/api/experience`, etc.                          | Portfolio API fully functional.                |
| **Day 5** | Data & Testing                   | Load sample data via `CommandLineRunner`. Test all endpoints in Postman.                           | Verified working API + ready for Angular.      |
| **Day 6** | Angular Integration              | Connect frontend → Portfolio API. Display all sections dynamically.                                | Portfolio content loads from backend.          |
| **Day 7** | Review & Refactor                | Code cleanup, add pagination/sorting, prepare README.                                              | Week 1 stable baseline.                        |

---

### 📊 **Week 2 – Metrics & Blog API**

| Day        | Focus Area                    | Detailed Tasks                                                             | Outcome                              |
|------------|-------------------------------|----------------------------------------------------------------------------|--------------------------------------|
| **Day 8**  | Models & Database             | Create `Post`, `Content`, `Comment`, `Like`, `Metric` entities.            | Basic MongoDB structure ready.       |
| **Day 9**  | CRUD Operations               | Implement repository + service layers. Add `/api/posts` endpoints.         | Posts and comments fully CRUD-ready. |
| **Day 10** | Metrics Tracking              | Add IP-based view counter & aggregation logic.                             | Views tracked per post.              |
| **Day 11** | Likes & Comments              | Add like/unlike endpoints and comment posting.                             | Interactive engagement working.      |
| **Day 12** | GitHub OAuth Integration      | Allow only GitHub users to comment or like.                                | Secure social interaction system.    |
| **Day 13** | Profanity Filter + Rate Limit | Block bad words and prevent spam requests.                                 | Clean and safe comment system.       |
| **Day 14** | Admin Access (Header Auth)    | Implement `X-ADMIN-TOKEN` header, verify with BCrypt against `ADMIN_HASH`. | Only you can access admin routes.    |

---

### 🧰 **Week 3 – Admin Panel, Integration & Deployment**

| Day        | Focus Area                   | Detailed Tasks                                                                        | Outcome                              |
|------------|------------------------------|---------------------------------------------------------------------------------------|--------------------------------------|
| **Day 15** | Admin Dashboard              | Create Angular admin page, input token, view metrics (most viewed, liked, commented). | Functional admin dashboard.          |
| **Day 16** | Admin Controls               | Enable edit/delete for posts/comments using admin header.                             | Full control over content.           |
| **Day 17** | Integration Tests            | Run end-to-end tests Angular ↔ Spring ↔ Mongo.                                        | Stable full-stack communication.     |
| **Day 18** | CI/CD Setup                  | Add GitHub Actions for both apps (build, test, dockerize).                            | Automated CI pipeline working.       |
| **Day 19** | Secrets & Deployment         | Configure environment vars (`ADMIN_HASH`, `MONGO_URI`). Deploy Docker containers.     | Live deployment ready.               |
| **Day 20** | Angular Deployment           | Deploy frontend (GitHub Pages / Vercel) + connect APIs.                               | Fully online system.                 |
| **Day 21** | Documentation & Final Review | Write README, API docs, screenshots, verify HTTPS + secrets.                          | Project 100% complete and shareable. |

---

### 🧩 **Optional (After Launch)**

| Task                                    | Purpose             |
|-----------------------------------------|---------------------|
| Add email notifications on new comments | More engagement     |
| Add Redis caching for metrics           | Better performance  |
| Add search by title/content             | User-friendly       |
| Add download counter for CV             | Portfolio analytics |
| Add analytics charts                    | Visual dashboard    |

---
