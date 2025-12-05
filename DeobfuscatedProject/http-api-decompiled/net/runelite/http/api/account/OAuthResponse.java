/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.account;

import java.util.UUID;

public class OAuthResponse {
    private String oauthUrl;
    private UUID uid;

    public String getOauthUrl() {
        return this.oauthUrl;
    }

    public UUID getUid() {
        return this.uid;
    }

    public void setOauthUrl(String oauthUrl) {
        this.oauthUrl = oauthUrl;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OAuthResponse)) {
            return false;
        }
        OAuthResponse other = (OAuthResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$oauthUrl = this.getOauthUrl();
        String other$oauthUrl = other.getOauthUrl();
        if (this$oauthUrl == null ? other$oauthUrl != null : !this$oauthUrl.equals(other$oauthUrl)) {
            return false;
        }
        UUID this$uid = this.getUid();
        UUID other$uid = other.getUid();
        return !(this$uid == null ? other$uid != null : !((Object)this$uid).equals(other$uid));
    }

    protected boolean canEqual(Object other) {
        return other instanceof OAuthResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $oauthUrl = this.getOauthUrl();
        result = result * 59 + ($oauthUrl == null ? 43 : $oauthUrl.hashCode());
        UUID $uid = this.getUid();
        result = result * 59 + ($uid == null ? 43 : ((Object)$uid).hashCode());
        return result;
    }

    public String toString() {
        return "OAuthResponse(oauthUrl=" + this.getOauthUrl() + ", uid=" + String.valueOf(this.getUid()) + ")";
    }
}

