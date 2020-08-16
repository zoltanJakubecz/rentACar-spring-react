import React from 'react';
import './App.css';
import Landingpage from './components/Landingpage'
import Kuku from './components/Kuku';
import Navbar from './components/Navbar';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Landingpage />
      <Kuku />
      <Kuku />
      <Kuku />
    </div>
  );
}

export default App;
