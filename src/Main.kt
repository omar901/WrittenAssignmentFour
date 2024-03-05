class SignUpActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.signup_activity)

        setupUI()
    }

    private fun setupUI() {
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        val button = findViewById<Button>(R.id.signup_button)

        button.setOnClickListener {
            if (isValidEmail(email.text.toString()) && isValidPassword(password.text.toString())) {
                // Save account to DB
                // Since this process usually involves network request,
                // make sure it is done off the main thread
            } else {
                // Show error
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        // Add email validation logic
    }

    private fun isValidPassword(password: String): Boolean {
        // Add password validation logic
    }
