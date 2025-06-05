# Use official Node image
FROM node:18-alpine

# Set working directory
WORKDIR /app

# Copy package.json and lock file first
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy all project files
COPY . .

# Expose Vite dev server port
EXPOSE 5173

# Run the dev server
CMD ["npm", "run", "dev"]