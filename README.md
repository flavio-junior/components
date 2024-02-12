# Library to sharing data in compose

**Step 1. Add the JitPack repository to your build file. Add it in your root settings.gradle.kts at the end of repositories:**
```gradle
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
      mavenCentral()
      maven { url 'https://jitpack.io' }
    }
}
```

**Step 2. Add the dependency:**
```gradle
dependencies {
  implementation 'com.github.flavio-junior:components:1.0'
}
```

### Padrões de commits e Pull Request aceitos:
- **feat:** `Cria nova feature.`
- **fix:** `Correção de bugs na aplicação.`
- **docs:** `Indica que houver a criação, implementação ou alterações na documentação.`
- **test:** `Indica a criação, implementação ou alterações em testes.`
- **refactor:** `Refatoração que não alteram sua funcionalidade.`
- **build:** `Indica que houver a criação, implementação ou alterações em arquivos de build ou dependências.`
- **chore:** `Indica atualizações de tarefas de build, configurações de administrador,pacotes, etc.`
- **perf:** `Alterações de código que estejam relacionadas à performance.`
- **style:** `Alterações referentes a formatação de código, mas que não alteram o sistema.`
- **revert:** `Reversão de um commit anterior.`

***exemplo:*** `git commit -m "docs: adding instructions"`

### Branchs principais do projeto:
- `main`
- `sua branch`

