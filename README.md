# Parcial Segundo Corte | David Leon
## Objetivo 
- Validar los conocimientos aprendidos durante el transcurso del semestre
## Herramientas utilizadas
 - Maven
 - Java 
 - Git 
 - Spark
 - AWS
 - Docker
## Uso
- Clonar el repositorio con el siguiente comando

    git clone https://github.com/davidleon03/ParcialArep2do.git
    
    
- Compilamos con:

    mvn clean package install
    
- Ejecutamos con el siguiente comando:

    java -cp "target/classes;target/dependency/*" org.escuelaing.arep.Spark   
## Como correr EC2
- Empezamos creando una instancia

![image](https://user-images.githubusercontent.com/98216838/229213990-7ff6bc25-c098-4ccf-8b01-64cba7abbedb.png)

- Creamos par de claves para poder conectarnos a la instancia

![image](https://user-images.githubusercontent.com/98216838/229214035-3ff20762-418f-4af3-93dc-08db04a8ab12.png)
- Verificamos su lanzamiento

![image](https://user-images.githubusercontent.com/98216838/229214108-9da36121-5c64-4bf8-86e3-475b8705dde0.png)
- Configuramos el grupo de seguridad para poder acceder al puerto 42000

![image](https://user-images.githubusercontent.com/98216838/229214231-c09ca3ca-c5eb-4fc6-a9ae-e8046d655f0f.png)
![image](https://user-images.githubusercontent.com/98216838/229214356-af0902a5-367c-41e4-b9ad-156f1beb4832.png)
## Pruebas con IP Y DNS
![image](https://user-images.githubusercontent.com/98216838/229215004-df97c036-cbf4-49d5-b84c-4aed589e6208.png)
![image](https://user-images.githubusercontent.com/98216838/229215292-069c1b74-1b3a-4ac5-b914-1ce7ae0dc3d6.png)
![image](https://user-images.githubusercontent.com/98216838/229215465-042b9e63-a220-42fd-9089-842adfbc14d9.png)
![image](https://user-images.githubusercontent.com/98216838/229216745-3544fe09-50f3-4821-b069-9407dc2e7a40.png)
## Video
-
## Autor
- David Leon
