package designpattern.builder;

public class RequestBody {
    private String cardNumber;
    private String expiryDate;
    private int cvv;
    private String virtualAddress;

    private RequestBody(RequestBuilder builder) {
        this.cardNumber = builder.cardNumber;
        this.cvv = builder.cvv;
        this.expiryDate = builder.expiryDate;
        this.virtualAddress = builder.virtualAddress;
    }

    public String getCardNumber() {
        return this.cardNumber;
    } 

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String getVirtualAddress() {
        return this.virtualAddress;
    }

    public int getCvv() {
        return this.cvv;
    }

    public static class RequestBuilder {
        private String cardNumber;
        private String expiryDate;
        private int cvv;
        private String virtualAddress;

        public RequestBuilder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public RequestBuilder setCvv(int cvv) {
            this.cvv = cvv;
            return this;
        }
        public RequestBuilder setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public RequestBuilder setVirtualAddress(String virtualAddress) {
            this.virtualAddress = virtualAddress;
            return this;
        }
        public RequestBody build() {
            return new RequestBody(this);
        } 
    }
}
