/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.game;

import java.io.File;
import java.net.URL;
import net.runelite.client.RuneLite;

public abstract class Sound {
    public abstract URL getPath();

    static final class SoundFileResource
    extends Sound {
        private final File file;

        @Override
        public URL getPath() {
            return this.file.toURI().toURL();
        }

        public SoundFileResource(File file) {
            this.file = file;
        }

        public File getFile() {
            return this.file;
        }

        public String toString() {
            return "Sound.SoundFileResource(file=" + String.valueOf(this.getFile()) + ")";
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof SoundFileResource)) {
                return false;
            }
            SoundFileResource other = (SoundFileResource)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            File this$file = this.getFile();
            File other$file = other.getFile();
            return !(this$file == null ? other$file != null : !((Object)this$file).equals(other$file));
        }

        protected boolean canEqual(Object other) {
            return other instanceof SoundFileResource;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = super.hashCode();
            File $file = this.getFile();
            result = result * 59 + ($file == null ? 43 : ((Object)$file).hashCode());
            return result;
        }
    }

    static final class SoundJarResource
    extends Sound {
        private final String path;

        @Override
        public URL getPath() {
            return RuneLite.class.getResource(this.path);
        }

        public SoundJarResource(String path) {
            this.path = path;
        }

        public String toString() {
            return "Sound.SoundJarResource(path=" + String.valueOf(this.getPath()) + ")";
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof SoundJarResource)) {
                return false;
            }
            SoundJarResource other = (SoundJarResource)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            URL this$path = this.getPath();
            URL other$path = other.getPath();
            return !(this$path == null ? other$path != null : !((Object)this$path).equals(other$path));
        }

        protected boolean canEqual(Object other) {
            return other instanceof SoundJarResource;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = super.hashCode();
            URL $path = this.getPath();
            result = result * 59 + ($path == null ? 43 : ((Object)$path).hashCode());
            return result;
        }
    }
}

