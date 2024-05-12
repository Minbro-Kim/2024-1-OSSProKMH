// App.js

import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from "./Home";
import Main from "./Main";
import Detail from "./Detail";
import "./css/App.css";

function App() {
  return (
    <Router>
      <div className="App">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/main" element={<Main />} />
          <Route path="/board/:id" element={<Detail />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
