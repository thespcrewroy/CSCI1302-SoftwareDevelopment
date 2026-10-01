# Running a Docker Container with MySQL

Last tested with Docker Engine: 29.1.3 on macOS 26.2.

> **Note 1:** This document has shown file and directory paths for a Unix operating system. If you are using a Windows system, you will have to change the paths to Windows style paths.

> **Note 2:** If you are using a Windows system, depending on the shell you use, you may have to replace the `\` escape character with `^` or `` ` ``. Alternatively, you can write the command as a single line without the `\` characters at the end.

## Step 1: Install Docker

Install Docker on your machine: https://docs.docker.com/engine/install/

> **Note:** The latest version of Docker will work.

## Step 2: Start a Docker Container

Use the following command to start a Docker container.

### Unix / macOS

```bash
docker run --name mysql-server-x370 \
    -v ~/mysql-data-x370:/var/lib/mysql \
    -p 33306:3306 \
    -e MYSQL_ROOT_PASSWORD=mysqlpass \
    -d mysql:8.1.0
```

### Windows (Command Prompt)

```cmd
docker run --name mysql-server-x370 ^
    -v C:\path\to\mysql-data-x370:/var/lib/mysql ^
    -p 33306:3306 ^
    -e MYSQL_ROOT_PASSWORD=mysqlpass ^
    -d mysql:8.1.0
```

### Windows (PowerShell)

```powershell
docker run --name mysql-server-x370 `
    -v C:\path\to\mysql-data-x370:/var/lib/mysql `
    -p 33306:3306 `
    -e MYSQL_ROOT_PASSWORD=mysqlpass `
    -d mysql:8.1.0
```
> [!IMPORTANT]\
> The `docker run` command is used only when you create a container for the first time. After creating a container, you can stop and start it again using `docker stop <container_id>` or `docker start <container_id>`. 

## Step 3: Open a Shell to the Docker Container

`docker exec -it mysql-server-x370 bash`

## Step 4: Connect to the Database Server with MySQL Client

`mysql -u root -p`

> [!NOTE]\
>  Enter the following password when prompted: `mysqlpass`.

If your previous step is successful, you will receive a mysql prompt that looks like `mysql>`. <br>
You can provide SQL and other MySQL specific commands at this prompt.

> **Note**: MySQL setup has two parts. The MySQL server and the MySQL client. The MySQL server is the actual database management system. The MySQL client is a command line tool that lets you communicate with the MySQL server.

## Managing Docker Containers

Check the Docker manual on how to manage containers and images:
- https://docs.docker.com/get-started/docker_cheatsheet.pdf
- https://docs.docker.com/engine/reference/commandline/docker/

> [!IMPORTANT]\
> Please make sure to use the exact container image `mysql:8.1.0` so that everyone has the same system.
> Your mysql data directory is stored at `~/mysql-data-x370`. This is where all databases will be physically stored. Make sure to protect it.
> If you delete `~/mysql-data-x370` or it gets corrupted, your databases may no longer work.


