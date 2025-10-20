# Repository Guidelines

## Localization & Language Preference

- 所有 Codex CLI（終端機）回覆應以繁體中文撰寫。
- 若輸入為英文，請自動以繁體中文回覆並保留技術關鍵詞（如 class、method、bean、IoC）。
- 回覆時保持專業、簡潔，除非使用者特別要求，不需翻譯專有名詞。

## Code Explanation & Commenting Standard (Traditional Chinese, Mandatory)

- 對 **每一個新建或修改的程式碼**，請一律提供：
    1) **變更摘要（繁體中文）**：在回覆中以條列清楚說明修改目的、影響範圍、設計取捨與可能的副作用。
    2) **中文註解（內嵌於程式碼）**：在關鍵邏輯、非直覺判斷、錯誤處理、邊界條件與演算法步驟處，加入簡潔的繁體中文註解。
    3) **方法／類別層級註解**：以 JavaDoc 或等價註解（繁體中文）描述用途、參數、回傳與可能例外。
    4) **測試說明**：若有新增/更新測試，說明測試情境與覆蓋的行為（繁體中文）。

- 註解風格要求（以 Java 為例，其他語言比照）：
    - 內嵌註解：使用 `//` 或 `/* ... */`，重點在「為何這麼做」，避免贅述程式表面語意。
    - 保留技術關鍵詞原文（如 IoC、bean、Controller、Factory method），其餘以繁體中文敘述。

- 產出格式（回覆時請同時提供）：
    1) 「變更摘要（繁體中文）」小節
    2) 「修改後的完整檔案」：含繁體中文註解

## Project Structure & Module Organization

- `pom.xml` holds the Spring Boot + Maven configuration, targeting Java 25 and the IoC showcase dependencies.
- `src/main/java/creaditCard` contains the core payment beans; keep new services in coherent packages (e.g., `payment`,
  `customer`) under `src/main/java`.
- `src/main/resources/application.properties` is available for environment overrides; prefer profile-specific files when
  configuration grows.
- `src/test/java` is empty; mirror the production package layout when adding unit or slice tests.

## Build, Test, and Development Commands

- `./mvnw clean verify` compiles all sources, runs unit tests, and fails the build on style or compilation issues.
- `./mvnw spring-boot:run` launches the application with the default profile; use `--debug` for IoC wiring insight.
- `./mvnw dependency:tree` helps audit bean dependencies when introducing new modules.

## Coding Style & Naming Conventions

- Follow standard Java style: 4-space indentation, braces on the same line, and meaningful class names (e.g.,
  `CreditCardService`).
- Use lowerCamelCase for method and field names; prefer constructor injection for Spring beans.
- Keep package names lowercase; align test package names with their corresponding production packages for component
  scanning.

## Testing Guidelines

- Add JUnit 5 tests with Spring Boot’s `@SpringBootTest` or focused slice annotations (`@WebMvcTest`, `@DataJpaTest`) as
  needed.
- Name test classes `<TypeUnderTest>Tests` and methods `should<Behavior>` to surface intent.
- Aim to cover each public bean method and IoC configuration path; run `./mvnw test` locally before pushing.

## Commit & Pull Request Guidelines

- Use concise, imperative commit messages similar to `git init + add credit card example`; group related changes
  together.
- Reference issues in commit or PR descriptions when applicable, and summarize functional impacts plus manual
  verification.
- PRs should list new commands/config toggles, include screenshots for UI changes (if any), and mention added tests or
  rationale when tests were skipped.

## Dependency Injection Tips

- Prefer Spring stereotypes (`@Component`, `@Service`) and constructor injection to keep the IoC example idiomatic.
- Document new beans in class-level JavaDoc when their role in the design pattern is non-obvious.

