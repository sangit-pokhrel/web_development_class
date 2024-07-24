import React from 'react';

const StatsSection = () => {
  const stats = [
    { number: '250+', description: 'Courses by our best mentors' },
    { number: '1000+', description: 'Courses by our best mentors' },
    { number: '15+', description: 'Courses by our best mentors' },
    { number: '2400+', description: 'Courses by our best mentors' },
  ];

  return (
    <div className="container mx-auto py-12 px-12">
      <div className="flex md:grid-cols-4 justify-evenly">
        {stats.map((stat, index) => (
          <div key={index} className="bg-white rounded-md shadow-md p-6 text-center"
          style={{
            border: "2px solid #222"
          }}
          >
            <h2 className="text-3xl font-bold text-gray-800 mb-2">{stat.number}</h2>
            <p className="text-gray-600">{stat.description}</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default StatsSection;
