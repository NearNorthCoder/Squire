/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class w
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
