package edmt.dev.androidnewsapp.Model;

/**
 * Created by reale on 10/4/2017.
 */

public class Icon {
        private String url;
        private int width,height,bytes;
        private String format,sha1sum;
        private Object error;

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public int getWidth() {
                return width;
        }

        public void setWidth(int width) {
                this.width = width;
        }

        public int getHeight() {
                return height;
        }

        public void setHeight(int height) {
                this.height = height;
        }

        public int getBytes() {
                return bytes;
        }

        public void setBytes(int bytes) {
                this.bytes = bytes;
        }

        public String getFormat() {
                return format;
        }

        public void setFormat(String format) {
                this.format = format;
        }

        public String getSha1sum() {
                return sha1sum;
        }

        public void setSha1sum(String sha1sum) {
                this.sha1sum = sha1sum;
        }

        public Object getError() {
                return error;
        }

        public void setError(Object error) {
                this.error = error;
        }
}
