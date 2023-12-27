# Install Docker on EC2 Amazon Linux

```bash
sudo yum update -y
sudo yum install -y docker
sudo usermod -a -G docker ec2-user
sudo service docker start
sudo chkconfig docker on
sudo service docker status
```