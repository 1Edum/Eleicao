import Input from "./components/input";

export default function Home() {
  return (
    <main className="h-[92vh] flex flex-col items-center justify-center">
      <section className="bg-tertiary flex flex-col px-10 py-20 gap-12">
        <h1 className="text-center text-3xl">Login</h1>
        <div className="flex flex-col gap-2">
          <Input text="Email"/>
          <Input text="Senha"/>
        </div>
        <button className="bg-primary text-white py-2">Entrar</button>
      </section>

    </main>

    
  );
}
