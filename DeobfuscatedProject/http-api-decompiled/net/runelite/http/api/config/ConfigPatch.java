/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConfigPatch {
    Map<String, String> edit = new HashMap<String, String>();
    Set<String> unset = new HashSet<String>();
    String profileName;

    public Map<String, String> getEdit() {
        return this.edit;
    }

    public Set<String> getUnset() {
        return this.unset;
    }

    public String getProfileName() {
        return this.profileName;
    }

    public void setEdit(Map<String, String> edit) {
        this.edit = edit;
    }

    public void setUnset(Set<String> unset) {
        this.unset = unset;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ConfigPatch)) {
            return false;
        }
        ConfigPatch other = (ConfigPatch)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Map<String, String> this$edit = this.getEdit();
        Map<String, String> other$edit = other.getEdit();
        if (this$edit == null ? other$edit != null : !((Object)this$edit).equals(other$edit)) {
            return false;
        }
        Set<String> this$unset = this.getUnset();
        Set<String> other$unset = other.getUnset();
        if (this$unset == null ? other$unset != null : !((Object)this$unset).equals(other$unset)) {
            return false;
        }
        String this$profileName = this.getProfileName();
        String other$profileName = other.getProfileName();
        return !(this$profileName == null ? other$profileName != null : !this$profileName.equals(other$profileName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConfigPatch;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Map<String, String> $edit = this.getEdit();
        result = result * 59 + ($edit == null ? 43 : ((Object)$edit).hashCode());
        Set<String> $unset = this.getUnset();
        result = result * 59 + ($unset == null ? 43 : ((Object)$unset).hashCode());
        String $profileName = this.getProfileName();
        result = result * 59 + ($profileName == null ? 43 : $profileName.hashCode());
        return result;
    }

    public String toString() {
        return "ConfigPatch(edit=" + String.valueOf(this.getEdit()) + ", unset=" + String.valueOf(this.getUnset()) + ", profileName=" + this.getProfileName() + ")";
    }
}

