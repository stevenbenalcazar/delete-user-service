# Usar Node.js como base
FROM node:18-alpine

# Crear directorio de trabajo
WORKDIR /app

# Copiar archivos y dependencias
COPY package.json package-lock.json ./
RUN npm install

# Copiar código fuente
COPY . .

# Exponer el puerto
EXPOSE 3000

# Comando de inicio
CMD ["node", "src/index.js"]
