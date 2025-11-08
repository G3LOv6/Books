package login_panels;

/**
 * Restored ChatBotPanel (sanitized).
 *
 * NOTE: This file intentionally does not contain API keys. Set your keys via
 * environment variables (OPENAI_API_KEY / GROQ_API_KEY) or a local, gitignored
 * properties file and load them at runtime.
 */
public class ChatBotPanel {

    public ChatBotPanel() {
        // initialization
    }

    /**
     * Example accessor for an API key loaded from environment variables.
     * Replace with your project's configuration loader as needed.
     */
    public String getOpenAiKey() {
        String k = System.getenv("OPENAI_API_KEY");
        return (k != null && !k.isEmpty()) ? k : "REDACTED";
    }

    public String getGroqKey() {
        String k = System.getenv("GROQ_API_KEY");
        return (k != null && !k.isEmpty()) ? k : "REDACTED";
    }

    // Add chatbot integration methods below; ensure no secrets are hard-coded.
}
