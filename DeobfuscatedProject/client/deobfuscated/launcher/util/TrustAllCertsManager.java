/*
 * Deobfuscated from: c/r/m/w.java
 * Original class name: w
 * Purpose: X509TrustManager that accepts all certificates
 *
 * WARNING: This is INSECURE and should not be used in production!
 * It allows man-in-the-middle attacks by not validating SSL certificates.
 */
package squire.launcher.util;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/**
 * An insecure trust manager that accepts all SSL certificates.
 *
 * WARNING: This disables SSL certificate validation entirely!
 * Only use for development/testing purposes.
 */
public class TrustAllCertsManager implements X509TrustManager {

    /**
     * Returns no accepted issuers (accepts all).
     *
     * @return null (accepts all issuers)
     */
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    /**
     * Does not validate client certificates (accepts all).
     *
     * @param certificates The certificate chain
     * @param authType The authentication type
     */
    @Override
    public void checkClientTrusted(X509Certificate[] certificates, String authType) {
        // Intentionally empty - accepts all client certificates
    }

    /**
     * Does not validate server certificates (accepts all).
     *
     * @param certificates The certificate chain
     * @param authType The authentication type
     */
    @Override
    public void checkServerTrusted(X509Certificate[] certificates, String authType) {
        // Intentionally empty - accepts all server certificates
    }
}
