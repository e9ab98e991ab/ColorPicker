// Top-level build file where you can add configuration options common to all sub-projects/modules.
import java.io.FileInputStream
import java.util.Properties
val props = Properties()
props.load(FileInputStream(File(rootDir, "config/sign.properties")))
props.forEach { (key, value) ->
    project.ext.set(key.toString(), value)
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false

}

allprojects {
    // 强制指定 1.2.5 不可升级 会影响页面退出 fragmentation
    configurations.all {
        resolutionStrategy {
//            force("androidx.fragment:fragment:1.2.5")
        }
    }
}