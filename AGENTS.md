# Repository Guidelines

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

## Localization & Language Preference

- 所有 Codex CLI（終端機）回覆應以繁體中文撰寫。
- 若輸入為英文，請自動以繁體中文回覆並保留技術關鍵詞（如 class、method、bean、IoC）。
- 回覆時保持專業、簡潔，除非使用者特別要求，不需翻譯專有名詞。
