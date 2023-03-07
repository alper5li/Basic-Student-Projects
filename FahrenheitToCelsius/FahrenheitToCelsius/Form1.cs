namespace FahrenheitToCelsius
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
            if (radioButton1.Checked == true)
            {
                double Celsius = Convert.ToDouble(textBox1.Text);
                double Fahrenheit = Celsius * 1.8 + 32;
                textBox2.Text = Convert.ToString(Fahrenheit);
            }        
            if (radioButton2.Checked == true)
            {
                double Fahrenheit = Convert.ToDouble(textBox1.Text);
                double Celsius = (Fahrenheit - 32) / 1.8;
                textBox2.Text = Convert.ToString(Celsius);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = Convert.ToString("");
            textBox2.Text = Convert.ToString("0.00");
            radioButton1.Checked = false;
            radioButton2.Checked = false;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}