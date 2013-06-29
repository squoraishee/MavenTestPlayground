echo "Running Android Builder..."
mvn -Dandroid.sdk.path=/Users/hudson/android -Dbuild.number=${BUILD_VERSION} -Dsign.keystore="/Users/hudson/android/cert/mtvn.cert" -Dsign.alias="mtvn" -Dsign.password="mtvn1234Cert" -Dsign.keypass="mtvn1234Alias" -Dbuild.name=$JOB_NAME -Dandroid-maven-plugin.version=3.6.0 -Dplatform.version=17 -Dandroid.sdk.path=/Users/hudson/android site:generate clean install
