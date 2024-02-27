import React from "react";
import NavBar from "../../components/NavBar/NavBar";
import ResultsAndFilter from "../../components/subComponents/ResultsAndFilter/ResultsAndFilter"
import Footer from "../../components/Footer/Footer";

const results = [
  { id: 1, title: "Result 1", description: "Description for Result 1", rating: 4.5, num_rate: 33 },
  { id: 2, title: "Result 2", description: "Description for Result 2", rating: 3.2, num_rate: 20 },
  { id: 3, title: "Result 3", description: "Description for Result 3", rating: 2.4, num_rate: 5 },

  { id: 1, title: "Result 4", description: "Description for Result 4", rating: 1.1, num_rate: 10 },
  { id: 2, title: "Result 5", description: "Description for Result 5", rating: 2.3, num_rate: 21 },
  { id: 3, title: "Result 6", description: "Description for Result 6", rating: 4.9, num_rate: 500 },
];

import "./Navigation.css";
function Navigation() {
  return (
    <div className="Navigation">
      <NavBar />
      <ResultsAndFilter results={results}/>
      <Footer />
    </div>
  );
}

export default Navigation;
