dependencies {
    implementation(project(":applications"))
    implementation(project(":adapters:out:persistence-db"))

    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
}