/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class WebClient
implements X509TrustManager {
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
    }
}
