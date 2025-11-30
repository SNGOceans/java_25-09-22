import pages from '@hono/vite-cloudflare-pages'
import { defineConfig } from 'vite'

export default defineConfig({
  plugins: [pages()],
  build: {
    outDir: 'dist',
    emptyOutDir: true,
    rollupOptions: {
      external: [],
      output: {
        format: 'es',
        entryFileNames: '_worker.js',
        chunkFileNames: 'chunks/[name]-[hash].js',
        assetFileNames: 'static/[name]-[hash].[ext]'
      }
    },
    target: 'esnext',
    minify: 'terser',
    sourcemap: false
  },
  publicDir: 'public',
  resolve: {
    extensions: ['.ts', '.tsx', '.js', '.jsx', '.json']
  },
  server: {
    port: 5173,
    host: true
  },
  optimizeDeps: {
    exclude: ['@hono/vite-cloudflare-pages']
  }
})
