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
