// Module script for production
import kotlin.modules.*
fun project() {
    module("android") {
        sources += "/home/acsia/dev/android/hal9000/android/src/novoda/ping/android/Landing.kt"
        // Classpath
        classpath += "/opt/android-sdk-linux/platforms/android-10/android.jar"
        classpath += "/opt/android-sdk-linux/platforms/android-10/data/res"
        classpath += "/opt/android-sdk-linux/tools/support/annotations.jar"
        // Output directory, commented out
        //         classpath += "/home/acsia/dev/android/hal9000/android/out/production/android"
        classpath += "/home/acsia/dev/android/hal9000/android/lib/kotlin-runtime.jar"
        classpath += "/opt/android-sdk-linux/extras/google/gcm/gcm-client/dist/gcm.jar"
        // Java Source Roots
        classpath += "/home/acsia/dev/android/hal9000/android/src"
        classpath += "/home/acsia/.IdeaIC12/system/compile-server/android_1c70a0df/targets/java-production/android/android/generated_sources/aapt"
        classpath += "/home/acsia/.IdeaIC12/system/compile-server/android_1c70a0df/targets/java-production/android/android/generated_sources/build_config"
        // External annotations
        annotationsPath += "/home/acsia/.IdeaIC12/config/plugins/Kotlin/kotlinc/lib/kotlin-jdk-annotations.jar"
    }
}
