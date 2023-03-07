namespace CalculateCircle
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Double area;
            Double radius = Convert.ToDouble(textBox1.Text);
            area = Math.PI * radius * radius;
            label2.Text = "The area of circle is " + area.ToString("N3");

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            label2.Text = Convert.ToString("0.000");
            textBox1.Text = Convert.ToString("0");
        }
    }
}