echo "Running Android Builder..."
mvn -Dandroid.sdk.path=/Users/hudson/android -Dbuild.number=${BUILD_VERSION} -Dsign.keystore="/Users/android/hudson/cert/mtvn.cert" -Dsign.alias="mtvn" -Dsign.storepass="mtvn1234Cert" -Dkeypass="mtvn1234Alias" -Dbuild.name=$JOB_NAME -Dandroid-maven-plugin.version=3.6.0 clean install
