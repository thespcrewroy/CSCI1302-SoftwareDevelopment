# MySQL Client Text Editor Setup

Last tested with MySQL Docker image: `mysql:8.1.0`.

> **Note 1:** These steps assume you are running the MySQL client inside the Docker container from [01-docker-mysql.md](01-docker-mysql.md).

> **Note 2:** The `\e` command in the MySQL client opens your configured command-line editor so you can write SQL more comfortably.

## Step 1: Open a Shell to The Docker Container

```bash
docker exec -it mysql-server-x370 bash
```

## Step 2: Install a Text Editor in the Container

At the container shell prompt, run:

```bash
microdnf install vim
```

## Step 3: Configure the Default Editor

Open your shell profile file:

```bash
vi ~/.bashrc
```

Add this line, save, and exit:

```bash
export EDITOR=vim
```

## Step 4: Reconnect to Load the New Setting

Exit the container shell, then reconnect:

```bash
exit
docker exec -it mysql-server-x370 bash
```

## Step 5: Connect to MySQL and Use `\e`

Start the MySQL client:

```bash
mysql -u root -p
```

Then enter your password (`mysqlpass`) and run:

```sql
\e
```

Your configured editor (`vim`) should open. Write your SQL, save, and quit the editor to return to the MySQL prompt.

## Optional: Use a Different Editor

You can replace `vim` with another editor if available in the container. For example:

```bash
export EDITOR=nano
```
