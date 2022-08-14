import Navbar from "./components/Navbar/Navbar";
import Myshelf from "./pages/myshelf";
import Home from "./pages/home";
import Upload from "./pages/upload";
import PdfDisplayPage from "./pages/pdfdisplaypage";
import { Route, Routes } from "react-router-dom";

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/myshelf" element={<Myshelf />} />
          <Route path="/upload" element={<Upload />} />
          <Route path="/pdfdisplay" element={<PdfDisplayPage />} />
        </Routes>
      </div>
    </>
  );
}

export default App;
