namespace BMICalc
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String name = (String)textBox1.Text;
            Double weight = Convert.ToDouble(textBox2.Text);
            Double height = Convert.ToDouble(textBox3.Text);
            Double BMI = weight / Math.Pow((height/100),2);
            label4.Text = name + ", your BMI is " + BMI.ToString("N3");

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
            label4.Text = "Awaiting...";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}