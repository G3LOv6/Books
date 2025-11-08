package login_panels;

import java.util.HashMap;
import java.util.Map;

public class OTPManager {
    private static Map<String, OTPData> otpStorage = new HashMap<>();
    
    public static void storeOTP(String email, int otp) {
        otpStorage.put(email, new OTPData(otp, System.currentTimeMillis()));
    }
    
    public static Integer getOTP(String email) {
        OTPData data = otpStorage.get(email);
        if (data == null) return null;
        
        // Check if OTP expired (10 minutes = 600000 milliseconds)
        if (System.currentTimeMillis() - data.timestamp > 600000) {
            otpStorage.remove(email);
            return null;
        }
        
        return data.otp;
    }
    
    public static void removeOTP(String email) {
        otpStorage.remove(email);
    }
    
    // Inner class to store OTP with timestamp
    private static class OTPData {
        int otp;
        long timestamp;
        
        OTPData(int otp, long timestamp) {
            this.otp = otp;
            this.timestamp = timestamp;
        }
    }
}